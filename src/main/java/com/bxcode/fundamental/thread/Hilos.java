package com.bxcode.fundamental.thread;


import lombok.extern.log4j.Log4j2;

@Log4j2
public class Hilos implements Runnable {

    private String name;
    private boolean error;

    public Hilos(String name, boolean error) {
        this.name = name;
        this.error = error;
    }

    @Override
    public void run() {

        int j = 0;
        for (int i = 0; i < 10; i++) {
            if (this.isError()) {
                log.info(name, "\t\n " + j++);
            } else {
                log.info(name, "\t " + j++);
            }
        }
        log.info("termino ejecución");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }


    public static void main(String[] args) {
        Hilos hilo1 = new Hilos("Primer hijo", false);
        Hilos hilo2 = new Hilos("Segundo hijo", true);
        Thread thread1 = new Thread(hilo1);
        Thread thread2 = new Thread(hilo2);
        thread1.start();
        thread2.start();
    }
}
