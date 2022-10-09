package pl.niepracuj.service.file;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileService {

    String saveFile(MultipartFile multipartFile) throws IOException;
}
