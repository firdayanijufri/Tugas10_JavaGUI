package no4;

/*
Nama      : firdayani_13020180089
Kelas     : B2
hari/tgl  : Minggu, 15 Mei 2020
 */

import java.sql.SQLException;
	import java.util.List;
	public interface InterfaceMahasiswa{
	    Mahasiswa insert(Mahasiswa o) throws SQLException;
	    void update(Mahasiswa o) throws SQLException;
	    void delete(String nim) throws SQLException;
	    List getAll() throws SQLException;
	}
