package src.dataAccess;

import src.educationalInstitution.Kategori;

public class JdbcKategoriDao implements KategoriDao{
    @Override
    public void add(Kategori kategori) {
        System.out.println("Yeni kategori eklendi");

    }

    @Override
    public void update(Kategori kategori) {
        System.out.println("Kategori güncellendi");
    }
}
