package org.nurdin.school.util;

import org.nurdin.school.dto.BidForWorkDTO;
import org.nurdin.school.entity.BidForWorkEntity;
import org.springframework.stereotype.Service;

@Service
public class BidForWorkDTOMapper {
    //метод который BidForWorkDTO преобразует в BidForWorkEntity
    public static BidForWorkEntity bidForWorkDtoToEntity (BidForWorkDTO bidForWorkDTO) {
        BidForWorkEntity bidForWorkEntity = new BidForWorkEntity();
        bidForWorkEntity.setDocumentsOfEmployee(bidForWorkDTO.getDocumentsOfEmployee());
        bidForWorkEntity.setInfoOfEmployee(bidForWorkDTO.getInfoOfEmployee());
        bidForWorkEntity.setEmail(bidForWorkDTO.getEmail());
        return bidForWorkEntity;
    }
}
