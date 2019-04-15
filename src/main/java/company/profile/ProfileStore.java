package company.profile;

import java.util.HashMap;
import java.util.Map;

public enum ProfileStore {
    INSTANCE;

      Map<Integer,ProfileModel> profiles;
    {
        profiles=new HashMap<Integer,ProfileModel>();
    }
    public  void loadData(){
        for (int i=0;i<50;i++){
            ProfileModel model=ProfileModel.randomId();
            profiles.put(model.getId(),model);
        }
    }

    public  ProfileModel getProfile (int id){
        return  profiles.get(id);
    }
}
