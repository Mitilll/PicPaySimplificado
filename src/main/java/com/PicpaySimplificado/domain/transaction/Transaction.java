package com.PicpaySimplificado.domain.transaction;

import com.PicpaySimplificado.domain.users.User;
import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
@AllArgsConstructor
@Data
@EqualsAndHashCode(of = "id")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long transaction_id;

    private BigDecimal amount;

    @ManyToOne
    @JoinColumn(name = "user_sende_id")
    private User sender;

    @ManyToOne
    @JoinColumn(name = "user_reciver_id")
    private User reciver;

    private LocalDateTime timestamp;
}
