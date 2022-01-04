package Controller;
import Model.AdminModelInterface;
import Model.AdminModelInterfaceimpl;
import Model.AnggotaModelInterface;
import Model.AnggotaModelInterfaceimpl;
import Model.BukuModelInterface;
import Model.BukuModelInterfaceimpl;
import Model.PeminjamanModelInterface;
import Model.PeminjamanModelInterfaceimpl;

public class AllObjectModel {
    public static AdminModelInterface adminModel = new AdminModelInterfaceimpl();
    public static AnggotaModelInterface anggotaModel = new AnggotaModelInterfaceimpl();
    public static BukuModelInterface bukuModel = new BukuModelInterfaceimpl();
    public static PeminjamanModelInterface peminjamanModel = new PeminjamanModelInterfaceimpl();
}
