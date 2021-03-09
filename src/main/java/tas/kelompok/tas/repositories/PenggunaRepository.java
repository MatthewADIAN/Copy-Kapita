/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tas.kelompok.tas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tas.kelompok.tas.entities.fromdatabase.Pengguna;

/**
 *
 * @author USER
 */
public interface PenggunaRepository extends JpaRepository<Pengguna, String> {

    @Query(value = "SELECT password FROM pengguna WHERE email = :email", nativeQuery = true)
    String findByEmail(@Param("email") String email);
    
    @Query(value = "SELECT ID_Pengguna FROM pengguna WHERE email = :email", nativeQuery = true)
    String findIdByEmail(@Param("email") String email);
}
