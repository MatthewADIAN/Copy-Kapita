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
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import tas.kelompok.tas.entities.fromdatabase.FormKepentingan;
import tas.kelompok.tas.entities.fromdatabase.Pengguna;
import tas.kelompok.tas.repositories.PenggunaRepository;

/**
 *
 * @author ivanr
 */
@Service
public class RegisterService {

    @Autowired
    PenggunaRepository penggunaRepository;

    public Pengguna save(Pengguna pengguna) {
        return penggunaRepository.save(pengguna);
    }

    
}
