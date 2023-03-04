public class Book {
    private String tenSach;
    private String idSach;

    public Book(String tenSach, String idSach) {
        this.tenSach = tenSach;
        this.idSach = idSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getIdSach() {
        return idSach;
    }

    public void setIdSach(String idSach) {
        this.idSach = idSach;
    }

    public String toString() {
        return "Book [tenSach=" + tenSach + ", idSach=" + idSach + "]";
    }
}