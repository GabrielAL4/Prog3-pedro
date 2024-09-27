import com.mycompany.p1_prog3.model.Admin;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DaoAdmin extends Persistencia<Admin> implements Dao<Admin>{
    private final static String NOMEARQUIVO = "Admins.json";
    @Override
    public void save(Admin Admin) throws Exception {
        List<Admin> Admins = getAll();
        Admins.add(Admin);
        String json = getObjectmapper().writerWithDefaultPrettyPrinter().writeValueAsString(Admins);
        FileOutputStream out = new FileOutputStream(NOMEARQUIVO);
        out.write(json.getBytes());
        out.close();
    }
    @Override
    public List<Admin> getAll() throws Exception {
        try {
            FileInputStream in = new FileInputStream(NOMEARQUIVO);
            String json = new String(in.readAllBytes());
            List<Admin> Admins = getObjectmapper().readValue(json, new TypeReference<List<Admin>>() {
            });
            return Admins;
        } catch (FileNotFoundException f) {
            return new ArrayList();
        }
    }
}
