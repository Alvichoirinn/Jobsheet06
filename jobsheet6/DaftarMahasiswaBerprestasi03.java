package jobsheet6;

public class DaftarMahasiswaBerprestasi03 {
    Mahasiswa03 listMhs[] = new Mahasiswa03 [5];
    int idx;

    //Setelah ini tuliskan method tambah()
    void tambah(Mahasiswa03 m){
        if (idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        } else{
            System.out.println("Data sudah penuh!!");
        }
    }

    //setelah ini tuliskan method tampil()
    void tampil(){
        for (Mahasiswa03 m : listMhs){
            m.tampil();
            System.out.println("----------------------------");
        }
    }

    //setelah ini tuliskan method 
    void bubbleSort(){
        for(int i = 0; i < listMhs.length - 1; i++){
            for(int j = 1; j < listMhs.length - i; j++){
                if(listMhs[j].ipk > listMhs [j-1].ipk){
                    //di bawah ini proses swap atau penukuran
                    Mahasiswa03 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for(int i = 0; i < listMhs.length - 1; i++){
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++){
                if(listMhs[j].ipk < listMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            //Swap
            Mahasiswa03 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void insertionSort(){
        for(int i = 1; i < listMhs.length; i++){
            Mahasiswa03 temp = listMhs[i];
            int j = i;
            //untuk mengubah menjadi descending dapat dilakukan dengan mengubah tanda lebih dari dengan kurang dari  pada perulangan loop
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk){
                listMhs [j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

}
    //Menggunakan foreach  
    //Variabel sementara tmp untuk menampung mhs j

