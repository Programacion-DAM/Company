package org.iesfm.company.readers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.iesfm.company.Company;

public class XMLCompanyReader implements Reader<Company> {

    private ObjectMapper xmlMapper = new XmlMapper();

    @Override
    public Company read() {
        try {
            Company c = xmlMapper.readValue(getClass().getResource("/company.xml"), Company.class);
            return c;
        } catch(Exception e) {
            System.out.println("Error reading file " + e.getMessage());
            return null;
        }
    }
}
