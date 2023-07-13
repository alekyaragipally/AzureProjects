package com.azure.project.controller;

//import com.azure.cognitiveservices.speechtotext.models.SpeechRecognitionResult;
//import com.azure.cognitiveservices.speechtotext.SpeechConfig;
//import com.azure.cognitiveservices.speechtotext.SpeechRecognizer;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/cognitiveservices")
public class CognitiveServicesController {

//    @PostMapping("/audio-to-text")
//    public String convertAudioToText(@RequestParam("audioFile") MultipartFile audioFile) throws ExecutionException, InterruptedException {
//        // Create a SpeechConfig object with your Azure subscription key and region.
//        SpeechConfig speechConfig = new SpeechConfig("YOUR_SUBSCRIPTION_KEY", "YOUR_REGION");
//
//        // Create a SpeechRecognizer object using the SpeechConfig object.
//        SpeechRecognizer speechRecognizer = new SpeechRecognizer(speechConfig);
//
//        // Transcribe the audio file.
//        SpeechRecognitionResult result = speechRecognizer.recognizeOnceAsync().get();
//
//        // Print the transcription results.
//        System.out.println(result.getResultId().getChars(0).getAlternatives().getChars(0).getText());
//        return null;
//    }

}
