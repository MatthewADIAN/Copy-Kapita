/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tas.kelompok.tas.entities.fromdatabase;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Matthew
 */
@Entity
@Table(name = "pengguna")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pengguna.findAll", query = "SELECT p FROM Pengguna p")
    , @NamedQuery(name = "Pengguna.findByIDPengguna", query = "SELECT p FROM Pengguna p WHERE p.iDPengguna = :iDPengguna")
    , @NamedQuery(name = "Pengguna.findByEmail", query = "SELECT p FROM Pengguna p WHERE p.email = :email")
    , @NamedQuery(name = "Pengguna.findByNama", query = "SELECT p FROM Pengguna p WHERE p.nama = :nama")
    , @NamedQuery(name = "Pengguna.findByPassword", query = "SELECT p FROM Pengguna p WHERE p.password = :password")
    , @NamedQuery(name = "Pengguna.findByTelp", query = "SELECT p FROM Pengguna p WHERE p.telp = :telp")})
public class Pengguna implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_Pengguna")
    private String iDPengguna;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "telp")
    private String telp;

    public Pengguna() {
    }

    public Pengguna(String iDPengguna) {
        this.iDPengguna = iDPengguna;
    }

    public Pengguna(String iDPengguna, String email, String nama, String password, String telp) {
        this.iDPengguna = iDPengguna;
        this.email = email;
        this.nama = nama;
        this.password = password;
        this.telp = telp;
    }

    public String getIDPengguna() {
        return iDPengguna;
    }

    public void setIDPengguna(String iDPengguna) {
        this.iDPengguna = iDPengguna;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDPengguna != null ? iDPengguna.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pengguna)) {
            return false;
        }
        Pengguna other = (Pengguna) object;
        if ((this.iDPengguna == null && other.iDPengguna != null) || (this.iDPengguna != null && !this.iDPengguna.equals(other.iDPengguna))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tas.kelompok.tas.entities.fromdatabase.Pengguna[ iDPengguna=" + iDPengguna + " ]";
    }
    
}
