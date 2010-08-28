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
package org.jboss.seam.xml.test.method;

import javax.enterprise.inject.Instance;

public class MethodBean
{

   public int method()
   {
      return 1;
   }

   public int method(MethodValueBean bean)
   {
      return bean.value + 1;
   }

   public long method(MethodValueBean[][] beans)
   {
      return beans.length;
   }

   public int method(Instance<MethodValueBean> bean)
   {
      return bean.get().getValue() + 1;
   }

   public int method(Instance<MethodValueBean> bean, Instance<MethodValueBean> bean1)
   {
      return bean.get().getValue() + 1;
   }

}
