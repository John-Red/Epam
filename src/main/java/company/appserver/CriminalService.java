package company.appserver;

import company.appserver.dao.CriminalDAO;

public class CriminalService {

    CriminalDAO dao;

    public CriminalService() {
        dao = CriminalDAO.createDAO();
    }

    public ModelCriminal getCriminal(int id) {
        return dao.get(id);
    }




}
