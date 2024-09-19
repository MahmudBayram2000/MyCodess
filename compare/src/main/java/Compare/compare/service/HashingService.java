package Compare.compare.service;


import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

@Service
public class HashingService {

    // Generate MD5 Hash
    public String generateMD5(String input) {
        return DigestUtils.md5Hex(input);
    }

    // Generate SHA256 Hash
    public String generateSHA256(String input) {
        return DigestUtils.sha256Hex(input);
    }
}
