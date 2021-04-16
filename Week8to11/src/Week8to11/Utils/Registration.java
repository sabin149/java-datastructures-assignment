package Week8to11.Utils;

import Week8to11.Constants;
import Week8to11.FileHandler;

public class Registration {

    public String registerUser(String[] userDetail) {
        FileHandler fh = new FileHandler();
        return fh.CreateOrAdd(Constants.userDetailFileName, userDetail);
    }
}
