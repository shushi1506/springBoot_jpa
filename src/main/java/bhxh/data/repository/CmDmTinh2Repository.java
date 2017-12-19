package bhxh.data.repository;

import bhxh.data.model.CommonDmCqbhTinh;
import bhxh.data.model.CommonDmCqbhTinhCustomer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@Repository
public interface CmDmTinh2Repository extends JpaRepository<CommonDmCqbhTinhCustomer, Long> {
    Page<CommonDmCqbhTinhCustomer> findAll(Pageable pageable);

//    @Override
//    List<CommonDmCqbhTinh> findAllByID();

    @Query("select a.tenCqbhTinh,a.maCqbhTinh from CommonDmCqbhTinh a where a.maCqbhTinh = :maCqbhTinh")
    List<Object[]> findByMaCqbhTinh(@Param("maCqbhTinh") String maCqbhTinh);

    @Query("select a.tenCqbhTinh,a.maCqbhTinh from CommonDmCqbhTinh a  ")
    List<Object[]> findAllCommonDmCqbhTinh();

    @Query("select a.id,a.maCqbhTinh,a.tenCqbhTinh,a.diaChi from CommonDmCqbhTinh a  ")
    List<CommonDmCqbhTinhCustomer> findAllCommonDmCqbhTinhCustomer();

//    @Override
//    List<CommonDmCqbhTinhCustomer> findAll();
}

