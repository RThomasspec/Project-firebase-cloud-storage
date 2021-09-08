package com.projetFirebase.Project.firebase.cloud.storage.Controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultipartFile {

    @PostMapping ("/profile/pic")
    public Object upload(@RequestParam stParam("file") MultipartFile multipartFile) {
        logger.info("HIT -/upload | File Name : {}", multipartFile.getOriginalFilename());
        return fileService.upload(multipartFile);
    }

    @PostMapping("/profile/pic/{fileName}")
    public Object download(@PathVariable String fileName) throws IOException {
        logger.info("HIT -/download | File Name : {}", fileName);
        return fileService.download(fileName);
    }
}
