package com.aws.java.ecssqss3.service;

import com.aws.java.ecssqss3.model.SolicitacaoModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.TextMessage;
import java.io.IOException;

@Service
public class SolicitacaoService {

    private static final Logger LOG = LoggerFactory.getLogger(SolicitacaoService.class);

    private ObjectMapper objectMapper;

    private SolicitacaoModel solicitacaoModel;


    public SolicitacaoService(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @JmsListener(destination = "${aws.sqs.queue.product.events.name}")
    public void receiveProductEvent(TextMessage textMessage)
            throws JMSException, IOException {
        try{

            LOG.info("Mensagem Recebida: {}", textMessage.getText());
            SolicitacaoModel solicitacaoModel = objectMapper.readValue(textMessage.getText(), SolicitacaoModel.class);
            LOG.info("Classe preenchida após o Parse do Json: {}", solicitacaoModel.toString());
            //Book book = new Book(bookDto.getName(), bookDto.getAuthor());
            //bookRepository.save(new Book(book.getName(),book.getAuthor()));

        } catch (Exception e){
            throw new RuntimeException("Erro na recepção da Mensagem: ", e);
        }

    }
}
