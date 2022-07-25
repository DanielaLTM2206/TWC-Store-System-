
import ec.edu.espe.codeproject.controller.CashierController;
import ec.edu.espe.codeproject.model.Cashier;
import ec.edu.espe.codeproject.view.FrmCashier;
import junit.framework.TestCase;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class TestSystem extends TestCase {
    private CashierController cashierController;
    private Cashier cashier;
    private FrmCashier frmCashier;
    
    public void escenario (){
        cashierController = new CashierController();
        cashier = new Cashier();
        frmCashier = new FrmCashier();
        
    }
    
public void testValidateNumbers(){
    escenario();
    //assertEquals(expected, frmCashier.add(frmCashier));
        
}
}
