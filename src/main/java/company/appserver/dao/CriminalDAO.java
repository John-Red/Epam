package company.appserver.dao;

import company.appserver.ModelCriminal;

import java.util.List;

public interface CriminalDAO {

    ModelCriminal get(int id);

    List<ModelCriminal> getAll();

    List<ModelCriminal> getAll(String filter);

    void create(ModelCriminal model);

    void update(ModelCriminal model);

    void delete(int id);

    static CriminalDAO createDAO() {
        if (System.getProperty("env").equals("dev")) {
            return new SteveDBCriminalDAO();
        }
        if (System.getProperty("env").equals("prod")) {
            return new JdbcCriminalDAO();
        }
        return null;
    };
}
