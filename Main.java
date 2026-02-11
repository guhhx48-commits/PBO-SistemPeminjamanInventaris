import view.ViewMenu;
import controller.ControllerPeminjaman;
import database.Koneksi;
import java.sql.Connection;


public class Main {

    public static void main(String[] args) {

        ViewMenu view = new ViewMenu();
        view.tampilkanHeader();

        ControllerPeminjaman controller = new ControllerPeminjaman();
        controller.jalankan();
        
        Connection conn = Koneksi.getConnection();
        if (conn != null) {
            System.out.println("Koneksi database BERHASIL");
        }

    }
}

