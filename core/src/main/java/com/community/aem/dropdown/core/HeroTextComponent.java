package com.community.aem.dropdown.core;
 
import com.adobe.cq.sightly.WCMUsePojo;
import com.day.cq.search.PredicateGroup;
import com.day.cq.search.Query;
import com.day.cq.search.QueryBuilder;
import com.day.cq.search.result.SearchResult;
import com.day.cq.tagging.Tag;
import com.day.cq.tagging.TagManager;
     
import com.community.aem.dropdown.core.HeroTextBean;
    
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
     
    
    
import javax.jcr.Node;
import javax.jcr.Session;
     
    
    
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
    
    
    
public class HeroTextComponent
extends WCMUsePojo
{
    
     /** The hero text bean. */
    private HeroTextBean heroTextBean = null;
      
    /** Default log. */
    protected final Logger log = LoggerFactory.getLogger(this.getClass());
         
    @Override
    public void activate() throws Exception {
          
      heroTextBean = new HeroTextBean();
           
        //Get the values that the author entered into the AEM dialog
       String heading = getProperties().get("jcr:Heading", "");
       String description = getProperties().get("jcr:description","");
       String drop = getProperties().get("jcr:drop", "");
             
        heroTextBean.setHeadingText(heading);
       heroTextBean.setDescription(description);
       heroTextBean.setDrop(drop); 
                               
    }
    
         
    public HeroTextBean getHeroTextBean() {
        return this.heroTextBean;
    }
}