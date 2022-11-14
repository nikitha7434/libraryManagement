package com.examplespring.libraryManagement;

import javax.persistence.*;

@Entity
@Table(name = "libcard_table")
public class libraycard {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int fine;

    public libraycard(){
    }
public libraycard( int fine){

        this.fine=fine;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }
}
