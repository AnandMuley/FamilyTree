package com.familytree.bytereader;

public class LoopingReader {

    private byte[] input;

    public LoopingReader(byte[] input) {
        this.input = input;
    }

    public void readBytes(int offset) {
        for (int i = 0; i < (input.length - offset); i += offset * 2) {
            System.out.println("Writing byte from : " + i + " to " + (i + offset));
            for (int j = i; j < (i + offset); j++) {
                System.out.println(input[j]);
            }
        }
    }

    public void readBytes() {
        System.out.println("Writing All Bytes...");
        for (byte currByte : input) {
            System.out.println(currByte);
        }
    }

    public static void main(String[] args) {
        String dataIn = "Example of Hello";
        LoopingReader loopingReader = new LoopingReader(dataIn.getBytes());
//        loopingReader.readBytes();
        loopingReader.readBytes(4);
    }

}
