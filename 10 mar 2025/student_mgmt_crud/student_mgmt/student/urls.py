from django.urls import path
from .views import student_form, student_list,student_delete,student_update

urlpatterns = [
    path('student_form/', student_form, name='student_form'),
    path('student_list/', student_list, name='student_list'),
    path('student_delete/<int:id>/', student_delete, name='student_delete'),
    path('student_update/<int:id>/', student_update, name='student_update'),
]