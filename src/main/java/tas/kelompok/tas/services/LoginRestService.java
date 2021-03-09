/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tas.kelompok.tas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import tas.kelompok.tas.entities.rest.LoginInput;
import tas.kelompok.tas.entities.rest.LoginOutput;
import org.springframework.http.ResponseEntity;
import tas.kelompok.tas.repositories.PenggunaRepository;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;

/**
 *
 * @author ivanr
 */
@Service
public class LoginRestService {

    @Autowired
    PenggunaRepository penggunaRepository;

    public Boolean getByEmail(String emailHtmlParam, String passwordHtmlParam) {
        boolean testTrue = true;
        String passwordDatabase = penggunaRepository.findByEmail(emailHtmlParam);
        String passwordHtml = passwordHtmlParam;
        if (passwordDatabase.equals(passwordHtml)) {
            testTrue = true;
        } else {
            testTrue = false;
        }
        return testTrue;
    }

    public String getLoginId(LoginOutput output) {
        return output.getUser().getId();
    }

}
