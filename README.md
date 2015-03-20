NineGridLayout
--------------

 1. 简介

  这是一个用于实现像微信朋友圈和微博的类似的九宫格图片展示控件，通过自定义viewgroup实现，是用方便，只需要很简单的就可嵌入到项目中去。
  
  


----------


 2. 使用方法
 在项目的layout文件中添加如下xml即可加入到布局文件

                <com.weixinninegridlayout.NineGridlayout
                android:layout_marginTop="8dp"
                android:id="@+id/iv_ngrid_layout"
                android:layout_height="wrap_content"
                android:layout_width="match_parent" />

  因为大部分这类控件都是在listview里面用的，所以针对Listview的复用有针对性的优化，只需要在项目中调用NineGridlayout.setImagesData就可以实现图片的加载和显示。同时为了解耦合和，重写了一个CustomImageView嵌入了picasso图片加载库来加载图片。


----------


 3. 效果展示
 由于我用markdown嵌入图片发现大小不能调整，所以如果想要看跟多详情，可以去我的CSDN博客，地址：[自定义九宫格控件NineGridLayout ,实现微信朋友圈图片九宫格显示][1]



  ![效果1][2]
  ![效果2][3]
   
  [1]: http://blog.csdn.net/u012650948/article/details/43638427

  
  [3]: http://img.blog.csdn.net/20150208195246244?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvdTAxMjY1MDk0OA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center


  
----------


 4. 协议

>  /*
 * Copyright (C) 2015 panyihong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


