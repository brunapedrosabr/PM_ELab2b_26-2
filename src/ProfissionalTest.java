import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Escolha Personal ou Fisioterapeuta e complete 2 testes.
 * Um deles deve obrigatoriamente verificar o pagamento (registrarPagamento).
 * 
 * Escolhido Personal
 */
public class ProfissionalTest {

    @Test
    void testaAdicionarAulaAvulsa() {
        // Arrange
        Personal personal = new Personal("Ana", "P001");
        // Act — troque/complete conforme a classe escolhida
        double aulas = personal.addAulaAvulsa(12.0);
        // Assert
        assertEquals(12.0, aulas, 0.001,"Este teste testa a adição de 10 aulas avulsas para o profissional Personal.");
    }

    @Test
    void testaRegistrarPagamento() {
        // Arrange
        Personal personal = new Personal("Ana", "P001");
        // Act — troque/complete conforme a classe escolhida
        personal.addAulaAvulsa(10.0);
        double pagamento = personal.registrarPagamento();
        // Assert
        assertEquals(4231.5, pagamento, 0.001,"Este teste testa o retorno do pagamento do profissional Personal para 10 aulas avulsas registradas.");
    }

    // TODO: criar 2 testes unitários (AAA + mensagem na asserção)
    // TODO: um deles deve testar registrarPagamento
}
