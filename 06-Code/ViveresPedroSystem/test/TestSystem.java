
import ec.edu.espe.codeproject.controller.Validation;
import ec.edu.espe.codeproject.model.Cashier;
import ec.edu.espe.codeproject.view.FrmCashier;
import junit.framework.TestCase;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class TestSystem extends TestCase {
    private Validation cashierController;
    private Cashier cashier;
    private FrmCashier frmCashier;
    
    public void escenario (){
        cashierController = new Validation();
        cashier = new Cashier();
        frmCashier = new FrmCashier();
        
    }
    
public void testValidateNumbers(){
    escenario();
    //assertEquals(expected, frmCashier.add(frmCashier));
        
}
}
