class UserDetails {
    String name;
    String email;
}

class UserDetailsV2 extends UserDetails {
    int productsQty;
    double expense;
}

class NormalUser {
    UserDetails showUser(int x) {
        UserDetails obj = new UserDetails();
        return obj;
    }
}

class PrimeUser extends NormalUser {
    @Override
    UserDetailsV2 showUser(int x) {
        UserDetailsV2 obj = new UserDetailsV2();
        return obj;
    }
}

public class CovariantReturnType {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
