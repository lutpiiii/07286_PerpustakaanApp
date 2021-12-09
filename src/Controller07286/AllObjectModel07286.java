package Controller07286;

import Model07286.AdminModelInterface07286;
import Model07286.AdminModelInterfaceImp07286;
import Model07286.AnggotaModelInterface07286;
import Model07286.AnggotaModelInterfaceImp;
import Model07286.BukuModelEntity07286;
import Model07286.BukuModelInterface07286;
import Model07286.PeminjamanModelInterface;
import Model07286.PeminjamanModelInterfaceImp;

public class AllObjectModel07286 {
    public static AdminModelInterface07286 adminModel = new AdminModelInterfaceImp07286();
    public static AnggotaModelInterface07286 anggotaModel = new AnggotaModelInterfaceImp();
    public static BukuModelInterface07286 bukuModel = new BukuModelEntity07286();
    public static PeminjamanModelInterface peminjamanModel = new PeminjamanModelInterfaceImp();
}
