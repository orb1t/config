/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.seam.config.xml.test.method;

import javax.enterprise.util.AnnotationLiteral;

import junit.framework.Assert;

import org.jboss.seam.config.xml.test.AbstractXMLTest;
import org.junit.Test;

public class PrimitiveMethodTest extends AbstractXMLTest
{

   @Override
   protected String getXmlFileName()
   {
      return "primitive-method-beans.xml";
   }

   @Test
   public void methodTest()
   {
      int x = getReference(int.class, new Qual1Lit());
      Assert.assertTrue(x == 1);
      int[] y = getReference(int[].class, new Qual2Lit());
      for (int i = 0; i < y.length; ++i)
      {
         Assert.assertTrue(y[i] == i + 2);
      }

   }

   class Qual1Lit extends AnnotationLiteral<Qualifier1>
   {
   };

   class Qual2Lit extends AnnotationLiteral<Qualifier2>
   {
   };

}