package Compare.compare.controller;

import Compare.compare.service.ConversionService;
import Compare.compare.service.HashingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private ConversionService conversionService;

    @Autowired
    private HashingService hashingService;

    // XML to JSON Conversion Endpoint
    @PostMapping("/xml-to-json")
    public String xmlToJson(@RequestBody String xml) throws Exception {
        return conversionService.xmlToJson(xml);
    }

    // JSON to XML Conversion Endpoint
    @PostMapping("/json-to-xml")
    public String jsonToXml(@RequestBody String json) throws Exception {
        return conversionService.jsonToXml(json);
    }

    // MD5 Hashing Endpoint
    @PostMapping("/hash/md5")
    public String generateMD5(@RequestBody String input) {
        return hashingService.generateMD5(input);
    }

    // SHA256 Hashing Endpoint
    @PostMapping("/hash/sha256")
    public String generateSHA256(@RequestBody String input) {
        return hashingService.generateSHA256(input);
    }
}

