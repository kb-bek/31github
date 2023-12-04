Imports System.Linq.Expressions

Public Class Form1
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim adi As String
        Dim parol As Integer
        Dim girilenAd As String
        Dim girilenParol As Integer

        adi = "bilisim"
        parol = 12345
        girilenAd = TextBox1.Text
        girilenParol = TextBox2.Text

        If girilenAd = adi And girilenParol = parol Then
            Button2.Text = "Giris basarili"
            Button2.BackColor = Color.Green
        Else
            Button2.Text = "Giris basarisiz"
            Button2.BackColor = Color.Red
        End If
    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        End
    End Sub

End Class
