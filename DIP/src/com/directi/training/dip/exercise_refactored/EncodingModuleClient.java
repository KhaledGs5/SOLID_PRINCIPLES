package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        // Example 1: File to File encoding
        IReader fileReader = new FileReaderModule("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
        IWriter fileWriter = new FileWriterModule("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");
        IEncoder base64Encoder = new Base64EncoderModule();
        EncodingModule fileEncodingModule = new EncodingModule(fileReader, fileWriter, base64Encoder);
        fileEncodingModule.encode();

        // Example 2: Network to Database encoding
        IReader networkReader = new NetworkReaderModule("http://myfirstappwith.appspot.com/index.html");
        IWriter dbWriter = new DatabaseWriterModule();
        EncodingModule networkEncodingModule = new EncodingModule(networkReader, dbWriter, base64Encoder);
        networkEncodingModule.encode();
    }
}
