package japidviews.Products;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import s.*;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import japidviews._layouts.*;
import play.i18n.Messages;
import static  japidviews._javatags.JapidWebUtil.*;
import play.data.validation.Validation;
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import play.i18n.Lang;
import japidviews._tags.*;
import controllers.*;
import play.mvc.Http.*;
import japidviews._javatags.*;
//
// NOTE: This file was generated from: japidviews/Products/indexj.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class indexj extends main
{	public static final String sourceTemplate = "japidviews/Products/indexj.html";
{
	headers.put("Content-Type", "text/html; charset=utf-8");
}

// - add implicit fields with Play

	final Request request = Request.current(); 
	final Response response = Response.current(); 
	final Session session = Session.current();
	final RenderArgs renderArgs = RenderArgs.current();
	final Params params = Params.current();
	final Validation validation = Validation.current();
	final cn.bran.play.FieldErrors errors = new cn.bran.play.FieldErrors(validation);
	final play.Play _play = new play.Play(); 

// - end of implicit fields with Play 



// -- set up the tag objects
final ProductDetail _ProductDetail0 = new ProductDetail(getOut());
{ _ProductDetail0.setActionRunners(getActionRunners()); }

// -- end of the tag objects

	public indexj() {
		super(null);
	}
	public indexj(StringBuilder out) {
		super(out);
	}
	private List<Product> products;
	public cn.bran.japid.template.RenderResult render(List<Product> products) {
		this.products = products;
		long t = -1;
		super.layout("Product listing", "Product listing");
		return new cn.bran.japid.template.RenderResultPartial(this.headers, getOut(), t, actionRunners);
	}
	@Override protected void doLayout() {
//------
;// line 1
;// line 1
;// line 2
p("<table>\n" + 
"    ");// line 3
for (Product product:products) {// line 6
p("        <tr>\n" + 
"            <td>");// line 6
_ProductDetail0.setOut(getOut()); _ProductDetail0.render(product);
// line 8
p("</td>\n" + 
"            <td>\n" + 
"                ");// line 8
for(Category category: product.getCategories()){// line 10
p("				    ");// line 10
p(category.getName());// line 11
p(", \n" + 
"				");// line 11
}// line 12
p("            </td>\n" + 
"        </tr>\n" + 
"    ");// line 12
}// line 15
p("</table>\n" + 
"\n");// line 15

	}

}