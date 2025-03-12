from django.shortcuts import render,redirect

from .models import Student

def student_list(request):
    Students = Student.objects.all()
    return render(request, 'students/student_list.html', {'Students': Students})

# Create your views here.
def student_form(request):
    if request.method == 'POST':
        sname = request.POST['sname']
        sclass = request.POST['sclass']
        ssection = request.POST['ssection']
        sgender = request.POST['sgender']
        sdob = request.POST['sdob']
        
        Student.objects.create(sname=sname, sclass=sclass, ssection=ssection, sgender=sgender, sdob=sdob) 
        return redirect('student_list')
    return render(request, 'students/student_form.html')

def student_delete(request, id):
    Student.objects.filter(id=id).delete()
    return redirect('student_list')

def student_update(request,id):
    student = Student.objects.get(id=id)
    if request.method == 'POST':
        student.sname = request.POST['sname']
        student.sclass = request.POST['sclass']
        student.ssection = request.POST['ssection']
        student.sgender = request.POST['sgender']
        student.sdob = request.POST['sdob']
        student.save()
        return redirect('student_list')
    return render(request, 'students/student_form.html',{'student':student})