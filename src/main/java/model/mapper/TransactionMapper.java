package model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import it.mybankapplication.entity.Transaction;
import model.business.TransactionBusiness;
import model.dto.TransactionDto;

@Mapper
public interface TransactionMapper {

	TransactionMapper MAPPER = Mappers.getMapper(TransactionMapper.class);

    TransactionDto mapToTransactionDto(TransactionBusiness transBusiness);

    TransactionBusiness mapToTransactionBusiness(TransactionDto transDto);
    
    @Mapping(source = "card.cardNumber", target = "cardNumber")
    TransactionBusiness mapToTransactionBusiness(Transaction transaction);

//    Transaction mapToTransaction(TransactionBusiness transBusiness);
}
