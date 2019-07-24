package company.appserver.dao;

import company.appserver.ModelCriminal;
import company.appserver.dao.CriminalDAO;

import java.util.List;

public class SteveDBCriminalDAO implements CriminalDAO {

    @Override
    public ModelCriminal get(int id) {
        return null;
    }

    @Override
    public List<ModelCriminal> getAll() {
        //connect to SteveDB and perfom SELECT * FROM Criminals
        return null;
    }

    @Override
    public List<ModelCriminal> getAll(String filter) {
        return null;
    }

    @Override
    public void create(ModelCriminal model) {

    }

    @Override
    public void update(ModelCriminal model) {

    }

    @Override
    public void delete(int id) {

    }
}
