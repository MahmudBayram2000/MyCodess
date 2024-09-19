package Compare.compare.service;

import Compare.compare.model.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.stereotype.Service;

@Service
public class ConversionService {

    private final XmlMapper xmlMapper;
    private final ObjectMapper jsonMapper;

    public ConversionService() {
        this.xmlMapper = new XmlMapper();
        this.jsonMapper = new ObjectMapper();
    }

    
    public String xmlToJson(String xml) throws Exception {
        Person person = xmlMapper.readValue(xml, Person.class);
        return jsonMapper.writeValueAsString(person);
    }


    public String jsonToXml(String json) throws Exception {
        Person person = jsonMapper.readValue(json, Person.class);
        return xmlMapper.writeValueAsString(person);
    }
}
