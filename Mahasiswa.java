/**
 * Write a description of class Mahasiswa here.
 *
 * @author Maulidis Rezeki
 * @version (a version number or a date)
 */
public class Mahasiswa
{
    // instance variables - replace the example below with your own
    private int nim, umur;
    private String nama, alamat, kelas;
    
    
    /**
     * Constructor for objects of class Mahasiswa
     */
    public Mahasiswa(int nim, int umur, String nama, String alamat, String kelas)
    {
        this.nim = nim;
        this.umur = umur;
        this.nama = nama;
        this.alamat = alamat;
        this.kelas = kelas;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getnamaMhs()
    {
        return this.nama;
    }
    
    public String getalamatMhs()
    {
        return this.alamat;
    }
    
    public String getkelasMhs()
    {
        return this.kelas;
    }
    
    public int getnimMhs()
    {
        return this.nim;
    }
    
    public int getumurMhs()
    {
        return this.umur;
    }
    
    public void setnamaMhs(String nama){
        this.nama = nama;
    }
}