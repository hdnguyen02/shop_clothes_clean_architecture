package com.program.shop_clothes.infrastructure.service;

import com.dropbox.core.DbxException;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface DropboxService {

  void uploadFile(MultipartFile multipartFile, String path) throws DbxException, IOException;
  String createSharedLink(String path) throws DbxException;


}
