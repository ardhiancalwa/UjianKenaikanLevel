
public interface mengLelang {
    void addPenawar(int ID);
    void addIdBarang(int ID);
    void addHargaTawar(int harga);
    void setStatus(boolean status);

    int getHargaTertinggi();
    int getIdPenawar();
    boolean getStatus(int id);
}
