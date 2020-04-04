package com.Test2.CIS3368.Models;

import javax.persistence.*;

@Entity
@Table(name = "viruses")
public class Viruses {
        @Id
        @Column(name ="id")
        public int id;
        @Column(name = "name")
        public String name;
        @Column(name = "description")
        public String description;
        @Column(name= "symptoms")
        public String symptoms;
        @Column(name= "duration")
        public String duration;
        @Column(name= "mortalityrate")
        public float mortalityrate;
        @Column(name= "image")
        public String image;


        public Viruses(){

        }
        public Viruses(int id, String name, String description, String symptoms,String  duration, float mortalityrate,String image) {
            this.id = id;
            this.name = name;
            this.description=description;
            this.symptoms=symptoms;
            this.duration=duration;
            this.mortalityrate=mortalityrate;
            this.image=image;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getname() {
            return name;
        }

        public void setname(String name) {
            this.name = name;
        }

        public String getdescription() {
            return description;
        }

        public void setdescription(String description) {
            this.description= description;
        }

        public String getsymptoms() {
            return symptoms;
        }

        public void setsymptoms(String symptoms) {
            this.symptoms = symptoms;
        }

        public String getduration() {
        return duration;
        }

        public void setduration(String duration) {
        this.duration = duration;
        }

        public float getmortalityrate() {
        return mortalityrate;
        }

        public void setmortalityrate(String image) {
        this.mortalityrate = mortalityrate;
        }
        public String getimage() {
        return image;
        }

        public void setimage(String image) {
        this.image = image;
        }


}
