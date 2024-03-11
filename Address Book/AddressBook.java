import java.util.*;

public class AddressBook {
    private List<Address> addresses;

    public AddressBook() {
        addresses = new ArrayList<Address>();
    }

    public List<String> onStreet(String st) {
        ArrayList<String> result = new ArrayList<String>();

        for(Address a : addresses) {
            if(a.getStreet())
        }
    }

    public int newBusiness(String nm, String st, int no) {
        for(int i = 0; i < addresses.size(); i++) {
            Address a = addresses.get(i);
            if(a.getStreet().equals(st) && a.getNumber() == no) {
                addresses.set(i, new Address(nm, st, no));
                return i;
            }
        }
        addresses.add(new Address(nm, st, no));

        return addresses.size() - 1;
    }
}
