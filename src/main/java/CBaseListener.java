// Generated from C:/Users/damia/Desktop/kompilator/src/main/java\C.g4 by ANTLR 4.7

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;

/**
 * This class provides an empty implementation of {@link CListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class CBaseListener implements CListener {
	public static String asm = "";
	private Map<String, Type> var = new HashMap<String, Type>();
	private int i=1;
	private int l=2;
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStart(CParser.StartContext ctx) {
		asm += ".intel_syntax noprefix \n";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStart(CParser.StartContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunction(CParser.FunctionContext ctx) {
		asm+= ".global " + ctx.functionname().NAME().getText()+"\n";
		asm += ctx.functionname().NAME().getText() +
				":\n"+
				"push rbp\n" +
				"mov rbp, rsp\n";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunction(CParser.FunctionContext ctx) {
		i=1;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVariables(CParser.VariablesContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVariables(CParser.VariablesContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVariable(CParser.VariableContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVariable(CParser.VariableContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunctionname(CParser.FunctionnameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunctionname(CParser.FunctionnameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInside(CParser.InsideContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInside(CParser.InsideContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterReturnf(CParser.ReturnfContext ctx) {
		if(ctx.value().NAME() != null) {
			if(var.get(ctx.value().NAME().getText()) != null) {
				asm += "mov eax, DWORD PTR " + var.get(ctx.value().NAME().getText()).getVar() + "\n" + "pop rbp\n" +
						"ret\n";
			}
		}
		else if(ctx.value().INT() != null)
		{
			asm += "mov eax,"+ctx.value().INT().getText() + "\n" + "pop rbp\n" +
					"ret\n";
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitReturnf(CParser.ReturnfContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLine(CParser.LineContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLine(CParser.LineContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssignment(CParser.AssignmentContext ctx) {
		if(ctx.value(1)!= null)
		{
			if((ctx.value(1).NAME() != null) && (ctx.value(0).NAME() != null))
			{
				if((var.get(ctx.value(0).NAME().getText()).getType().equals("int"))&&(var.get(ctx.value(1).NAME().getText()).getType().equals("int"))) {
					asm += "mov eax, DWORD PTR " + var.get(ctx.value(1).NAME().getText()).getVar() +"\n";
					asm += "mov DWORD PTR " + var.get(ctx.value(0).NAME().getText()).getVar()+", eax" +"\n";
				}
			}
			else if((ctx.value(1).INT() != null) && (ctx.value(0).NAME() != null))
			{
				asm += "mov DWORD PTR " + var.get(ctx.value(0).NAME().getText()).getVar()+","+ctx.value(1).INT().getText() +"\n";
			}
		}
		else if((ctx.value(0) != null) && (ctx.math() != null))
		{
			if((ctx.math().value(0).NAME() != null)&& (ctx.math().value(1).INT() != null))
			{
				if(ctx.math().operation().PLUST() != null) {
					asm += "mov eax, DWORD PTR " +
							var.get(ctx.math().value(0).NAME().getText()).getVar() +
							"\n" +
							"add eax, " +
							ctx.math().value(1).INT().getText() +
							"\n" +
							"mov DWORD PTR" +
							var.get(ctx.value(0).NAME().getText()).getVar() +
							", eax" +
							"\n"
					;
				}
				else if(ctx.math().operation().MINUST() != null)
				{
					asm += "mov eax, DWORD PTR " +
							var.get(ctx.math().value(0).NAME().getText()).getVar() +
							"\n" +
							"sub eax, " +
							ctx.math().value(1).INT().getText() +
							"\n" +
							"mov DWORD PTR" +
							var.get(ctx.value(0).NAME().getText()).getVar() +
							", eax" +
							"\n"
					;
				}
				else if(ctx.math().operation().DIVT() != null)
				{
					asm += "mov eax, DWORD PTR " +
							var.get(ctx.math().value(0).NAME().getText()).getVar() +
							"\n" +
							"cdq \n"+
							"idiv eax, " +
							ctx.math().value(1).INT().getText() +
							"\n" +
							"mov DWORD PTR" +
							var.get(ctx.value(0).NAME().getText()).getVar() +
							", eax" +
							"\n"
					;
				}
				else if(ctx.math().operation().MULTIT() != null)
				{
					asm += "mov eax, DWORD PTR " +
							var.get(ctx.math().value(0).NAME().getText()).getVar() +
							"\n" +
							"imul eax, " +
							ctx.math().value(1).INT().getText() +
							"\n" +
							"mov DWORD PTR" +
							var.get(ctx.value(0).NAME().getText()).getVar() +
							", eax" +
							"\n"
					;
				}
			}
			else if((ctx.math().value(1).NAME() != null)&& (ctx.math().value(0).INT() != null))
			{
				if(ctx.math().operation().PLUST() != null) {
					asm += "mov eax, DWORD PTR " +
							var.get(ctx.math().value(1).NAME().getText()).getVar() +
							"\n" +
							"add eax, " +
							ctx.math().value(0).INT().getText() +
							"\n" +
							"mov DWORD PTR" +
							var.get(ctx.value(0).NAME().getText()).getVar() +
							", eax" +
							"\n"
					;
				}
				else if(ctx.math().operation().MINUST() != null) {
					asm += "mov eax, DWORD PTR " +
							var.get(ctx.math().value(1).NAME().getText()).getVar() +
							"\n" +
							"sub eax, " +
							ctx.math().value(0).INT().getText() +
							"\n" +
							"mov DWORD PTR" +
							var.get(ctx.value(0).NAME().getText()).getVar() +
							", eax" +
							"\n"
					;

				}
				else if(ctx.math().operation().MULTIT() != null) {
					asm += "mov eax, DWORD PTR " +
							var.get(ctx.math().value(1).NAME().getText()).getVar() +
							"\n" +
							"imul eax, " +
							ctx.math().value(0).INT().getText() +
							"\n" +
							"mov DWORD PTR" +
							var.get(ctx.value(0).NAME().getText()).getVar() +
							", eax" +
							"\n"
					;

				}
				else if(ctx.math().operation().DIVT() != null) {
					asm += "mov eax, DWORD PTR " +
							var.get(ctx.math().value(1).NAME().getText()).getVar() +
							"\n" +
							"cdq \n"+
							"idiv eax, " +
							ctx.math().value(0).INT().getText() +
							"\n" +
							"mov DWORD PTR" +
							var.get(ctx.value(0).NAME().getText()).getVar() +
							", eax" +
							"\n"
					;
				}
			}
			else if((ctx.math().value(1).NAME() != null)&& (ctx.math().value(0).NAME() != null))
			{
				if(ctx.math().operation().PLUST() != null) {
					asm += "mov edx, DWORD PTR " +
							var.get(ctx.math().value(0).NAME().getText()).getVar() +
							"\n" +
							"mov eax, DWORD PTR " +
							var.get(ctx.math().value(1).NAME().getText()).getVar() +
							"\n" +
							"add eax, edx" +
							"\n" +
							"mov DWORD PTR " +
							var.get(ctx.value(0).NAME().getText()).getVar() +
							", eax" +
							"\n";
				}
				else if(ctx.math().operation().MINUST() != null){
					asm += "mov edx, DWORD PTR " +
							var.get(ctx.math().value(0).NAME().getText()).getVar() +
							"\n" +
							"mov eax, DWORD PTR " +
							var.get(ctx.math().value(1).NAME().getText()).getVar() +
							"\n" +
							"sub edx, eax" +
							"\n" +
							"mov DWORD PTR " +
							var.get(ctx.value(0).NAME().getText()).getVar() +
							", eax" +
							"\n";
				}
				else if(ctx.math().operation().MULTIT() != null){
					asm += "mov edx, DWORD PTR " +
							var.get(ctx.math().value(0).NAME().getText()).getVar() +
							"\n" +
							"mov eax, DWORD PTR " +
							var.get(ctx.math().value(1).NAME().getText()).getVar() +
							"\n" +
							"imul eax, edx" +
							"\n" +
							"mov DWORD PTR " +
							var.get(ctx.value(0).NAME().getText()).getVar() +
							", eax" +
							"\n";

				}
				else if(ctx.math().operation().DIVT() != null){
					asm += "mov ea, DWORD PTR " +
							var.get(ctx.math().value(0).NAME().getText()).getVar() +
							"\n" +
							"mov edx, DWORD PTR " +
							var.get(ctx.math().value(1).NAME().getText()).getVar() +
							"\n" +
							"cdq \n"+
							"idiv eax, edx" +
							"\n" +
							"mov DWORD PTR " +
							var.get(ctx.value(0).NAME().getText()).getVar() +
							", eax" +
							"\n";
				}

			}
		}
		else if(ctx.variable() != null)
		{
			if(ctx.math() != null)
			{
				if(ctx.math().value(1) != null)
				{
					if((ctx.math().value(0).INT() != null)&&(ctx.math().value(1).INT()!=null))
					{
						int i1 = Integer.parseInt(ctx.math().value(0).INT().getText());
						int i2 = Integer.parseInt(ctx.math().value(1).INT().getText());
						int an=0;
						if(ctx.math().operation().PLUST() != null)
						{
							an = i1+i2;
						}
						else if(ctx.math().operation().MINUST() != null)
						{
							an = i1-i2;
						}
						else if(ctx.math().operation().DIVT() != null)
						{
							an = i1/i2;
						}
						else if(ctx.math().operation().MULTIT() != null)
						{
							an = i1*i2;
						}
						Type type = new Type("int", "[rbp-" + i * 4+"]");
						var.put(ctx.variable().NAME().getText(), type);
						asm+="mov DWORD PTR [rbp-"+i*4+"],"+an+"\n";
						i++;
					}
					else if((ctx.math().value(0).NAME() != null)&& (ctx.math().value(1).INT() != null))
					{
						if(ctx.math().operation().PLUST() != null) {
							Type type = new Type("int", "[rbp-" + i * 4 + "]");
							var.put(ctx.variable().NAME().getText(), type);
							asm += "mov eax, DWORD PTR " +
									var.get(ctx.math().value(0).NAME().getText()).getVar() +
									"\n" +
									"add eax, " +
									ctx.math().value(1).INT().getText() +
									"\n" +
									"mov DWORD PTR" +
									"[rbp-" + i * 4 + "]" +
									", eax" +
									"\n"
							;
						}
						else if(ctx.math().operation().MINUST() != null) {
							Type type = new Type("int", "[rbp-" + i * 4 + "]");
							var.put(ctx.variable().NAME().getText(), type);
							asm += "mov eax, DWORD PTR " +
									var.get(ctx.math().value(0).NAME().getText()).getVar() +
									"\n" +
									"sub eax, " +
									ctx.math().value(1).INT().getText() +
									"\n" +
									"mov DWORD PTR" +
									"[rbp-" + i * 4 + "]" +
									", eax" +
									"\n"
							;
						}
						else if(ctx.math().operation().MULTIT() != null) {
							Type type = new Type("int", "[rbp-" + i * 4 + "]");
							var.put(ctx.variable().NAME().getText(), type);
							asm += "mov eax, DWORD PTR " +
									var.get(ctx.math().value(0).NAME().getText()).getVar() +
									"\n" +
									"imul eax, " +
									ctx.math().value(1).INT().getText() +
									"\n" +
									"mov DWORD PTR" +
									"[rbp-" + i * 4 + "]" +
									", eax" +
									"\n"
							;

						}
						else if(ctx.math().operation().DIVT() != null) {
							Type type = new Type("int", "[rbp-" + i * 4 + "]");
							var.put(ctx.variable().NAME().getText(), type);
							asm += "mov eax, DWORD PTR " +
									var.get(ctx.math().value(0).NAME().getText()).getVar() +
									"\n" +
									"cdq \n"+
									"idiv eax, " +
									ctx.math().value(1).INT().getText() +
									"\n" +
									"mov DWORD PTR" +
									"[rbp-" + i * 4 + "]" +
									", eax" +
									"\n"
							;
						}
					}
					else if((ctx.math().value(1).NAME() != null)&& (ctx.math().value(0).INT() != null))
					{
						if(ctx.math().operation().PLUST() != null) {
							Type type = new Type("int", "[rbp-" + i * 4 + "]");
							var.put(ctx.variable().NAME().getText(), type);
							asm += "mov eax, DWORD PTR " +
									var.get(ctx.math().value(1).NAME().getText()).getVar() +
									"\n" +
									"add eax, " +
									ctx.math().value(0).INT().getText() +
									"\n" +
									"mov DWORD PTR" +
									"[rbp-" + i * 4 + "]" +
									", eax" +
									"\n"
							;
						}
						else if(ctx.math().operation().MINUST() != null) {
							Type type = new Type("int", "[rbp-" + i * 4 + "]");
							var.put(ctx.variable().NAME().getText(), type);
							asm += "mov eax, DWORD PTR " +
									var.get(ctx.math().value(1).NAME().getText()).getVar() +
									"\n" +
									"sub eax, " +
									ctx.math().value(0).INT().getText() +
									"\n" +
									"mov DWORD PTR" +
									"[rbp-" + i * 4 + "]" +
									", eax" +
									"\n"
							;
						}
						else if(ctx.math().operation().MULTIT() != null) {
							Type type = new Type("int", "[rbp-" + i * 4 + "]");
							var.put(ctx.variable().NAME().getText(), type);
							asm += "mov eax, DWORD PTR " +
									var.get(ctx.math().value(1).NAME().getText()).getVar() +
									"\n" +
									"imul eax, " +
									ctx.math().value(0).INT().getText() +
									"\n" +
									"mov DWORD PTR" +
									"[rbp-" + i * 4 + "]" +
									", eax" +
									"\n"
							;
						}
						else if(ctx.math().operation().DIVT() != null) {
							Type type = new Type("int", "[rbp-" + i * 4 + "]");
							var.put(ctx.variable().NAME().getText(), type);
							asm += "mov eax, DWORD PTR " +
									var.get(ctx.math().value(1).NAME().getText()).getVar() +
									"\n" +
									"cdq \n"+
									"idiv eax, " +
									ctx.math().value(0).INT().getText() +
									"\n" +
									"mov DWORD PTR" +
									"[rbp-" + i * 4 + "]" +
									", eax" +
									"\n"
							;
						}
					}
					else if((ctx.math().value(0).NAME() != null)&&(ctx.math().value(1).NAME() != null))
					{
						if(ctx.math().operation().PLUST() != null) {
							Type type = new Type("int", "[rbp-" + i * 4 + "]");
							var.put(ctx.variable().NAME().getText(), type);
							asm += "mov edx, DWORD PTR " +
									var.get(ctx.math().value(0).NAME().getText()).getVar() +
									"\n" +
									"mov eax, DWORD PTR " +
									var.get(ctx.math().value(1).NAME().getText()).getVar() +
									"\n" +
									"add eax, edx" +
									"\n" +
									"mov DWORD PTR " +
									"[rbp-" + i * 4 + "]" +
									", eax" +
									"\n"
							;
							i++;
						}
						else if(ctx.math().operation().MINUST() != null) {
							Type type = new Type("int", "[rbp-" + i * 4 + "]");
							var.put(ctx.variable().NAME().getText(), type);
							asm += "mov edx, DWORD PTR " +
									var.get(ctx.math().value(0).NAME().getText()).getVar() +
									"\n" +
									"mov eax, DWORD PTR " +
									var.get(ctx.math().value(1).NAME().getText()).getVar() +
									"\n" +
									"sub edx, eax" +
									"\n" +
									"mov DWORD PTR " +
									"[rbp-" + i * 4 + "]" +
									", eax" +
									"\n"
							;
							i++;
						}
						else if(ctx.math().operation().MULTIT() != null) {
							Type type = new Type("int", "[rbp-" + i * 4 + "]");
							var.put(ctx.variable().NAME().getText(), type);
							asm += "mov edx, DWORD PTR " +
									var.get(ctx.math().value(0).NAME().getText()).getVar() +
									"\n" +
									"mov eax, DWORD PTR " +
									var.get(ctx.math().value(1).NAME().getText()).getVar() +
									"\n" +
									"imul eax, edx" +
									"\n" +
									"mov DWORD PTR " +
									"[rbp-" + i * 4 + "]" +
									", eax" +
									"\n"
							;
							i++;
						}
						else if(ctx.math().operation().DIVT() != null) {
							Type type = new Type("int", "[rbp-" + i * 4 + "]");
							var.put(ctx.variable().NAME().getText(), type);
							asm += "mov eax, DWORD PTR " +
									var.get(ctx.math().value(0).NAME().getText()).getVar() +
									"\n" +
									"mov edx, DWORD PTR " +
									var.get(ctx.math().value(1).NAME().getText()).getVar() +
									"\n" +
									"cdq \n"+
									"idiv eax, edx" +
									"\n" +
									"mov DWORD PTR " +
									"[rbp-" + i * 4 + "]" +
									", eax" +
									"\n"
							;
							i++;
						}
					}
				}
				//TODO
			}
			else if(ctx.value() != null)
			{
				if(ctx.value(0).NAME() != null)
				{
					//TODO
					Type type = new Type("int", "[rbp-" + i * 4 + "]");
					var.put(ctx.variable().NAME().getText(), type);
					asm += "mov eax, DWORD PTR "+ var.get(ctx.value(0).NAME().getText()).getVar() + "\n";
					asm += "mov DWORD PTR [rbp-" + i * 4 + "], eax" + "\n";
					i++;
				}
				else {
					if (ctx.variable().type().INTT() != null) {
						Type type = new Type("int", "[rbp-" + i * 4 + "]");
						var.put(ctx.variable().NAME().getText(), type);
						asm += "mov DWORD PTR [rbp-" + i * 4 + "]," + ctx.value(0).INT().getText() + "\n";
						i++;

					}
				}
			}
		}

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssignment(CParser.AssignmentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMath(CParser.MathContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMath(CParser.MathContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOperation(CParser.OperationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOperation(CParser.OperationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterComparison(CParser.ComparisonContext ctx) {
		//TUTAJ
		if(ctx.compsign().EQUALT() != null || ctx.compsign().BIGGERT() != null || ctx.compsign().SMALLERT() != null || ctx.compsign().SMOREQT() !=null || ctx.compsign().BIOREQT() != null)
		{
			if(ctx.value(0).NAME() != null && ctx.value(1).NAME() != null)
			{
				asm+="mov eax, DWORD PTR "+var.get(ctx.value(0).NAME().getText()).getVar()+"\n";
				asm+="cmp eax, DWORD PTR "+var.get(ctx.value(1).NAME().getText()).getVar()+"\n";
			}
			else if(ctx.value(0).NAME() != null && ctx.value(1).INT() != null)
			{
				asm+="cmp DWORD PTR "+var.get(ctx.value(0).NAME().getText()).getVar()+", "+ctx.value(1).INT().getText()+"\n";
			}
			else if(ctx.value(0).INT() != null && ctx.value(1).NAME() != null)
			{
				asm+="cmp DWORD PTR "+var.get(ctx.value(1).NAME().getText()).getVar()+", "+ctx.value(0).INT().getText()+"\n";
			}
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitComparison(CParser.ComparisonContext ctx) {
		if(ctx.compsign().BIOREQT() != null )
			asm +="jng .L"+l+"\n";
		else if(ctx.compsign().EQUALT() != null )
			asm +="je .L"+l+"\n";
		else if(ctx.compsign().SMOREQT() != null )
			asm +="jnl .L"+l+"\n";
		else if(ctx.compsign().BIGGERT() != null )
			asm +="jl .L"+l+"\n";
		else if(ctx.compsign().SMALLERT() != null )
			asm +="jg .L"+l+"\n";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCompsign(CParser.CompsignContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCompsign(CParser.CompsignContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAcc(CParser.AccContext ctx) {
		asm+= "add DWORD PTR "+var.get(ctx.NAME().getText()).getVar()+", 1 \n";

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAcc(CParser.AccContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDec(CParser.DecContext ctx) {
		asm+= "sub DWORD PTR "+var.get(ctx.NAME().getText()).getVar()+", 1 \n";
		//TUTAJ
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDec(CParser.DecContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIff(CParser.IffContext ctx) {

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIff(CParser.IffContext ctx) {
		asm+=".L"+l+":"+"\n";
		l++;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterValue(CParser.ValueContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitValue(CParser.ValueContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterType(CParser.TypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitType(CParser.TypeContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}