package com.program.shop_clothes.infrastructure.service.impl;

import com.dropbox.core.DbxException;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.WriteMode;
import com.dropbox.core.v2.sharing.SharedLinkMetadata;
import com.program.shop_clothes.infrastructure.service.DropboxService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

@Service
@RequiredArgsConstructor
public class DropboxServiceImpl implements DropboxService {


    private final DbxClientV2 dropboxClient;

    @Override
    public void uploadFile(MultipartFile file, String path) throws DbxException, IOException {
        InputStream in = file.getInputStream();
        dropboxClient.files().uploadBuilder(path)
                .withMode(WriteMode.OVERWRITE)
                .uploadAndFinish(in);

    }

    @Override
    public String createSharedLink(String path) throws DbxException {
        SharedLinkMetadata sharedLinkMetadata = dropboxClient.sharing().createSharedLinkWithSettings(path);
        return sharedLinkMetadata.getUrl().replace("dl=0", "raw=1");
    }

}
