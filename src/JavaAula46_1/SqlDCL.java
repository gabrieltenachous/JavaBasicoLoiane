package JavaAula46_1;

public interface SqlDCL {
    void grant(String query);
    void revoke(String query);
}
