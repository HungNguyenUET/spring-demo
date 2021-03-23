package vn.viettuts.example.dependencyinjectionexample;

public class Student {
    private Address address;

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return this.address;
    }
}
